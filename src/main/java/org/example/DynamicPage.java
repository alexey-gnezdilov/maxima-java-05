package org.example;

import freemarker.template.*;

import java.io.*;
import java.util.*;

public class DynamicPage {
    public static void createPage(String filename) throws IOException, TemplateException {

        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(new File(filename));
        cfg.setIncompatibleImprovements(new Version(2, 3, 20));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocale(Locale.US);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        Map<String, Object> input = new HashMap<>();

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murzik", 10, "https://ru.wikipedia.org/wiki/%D0%9C%D0%B0%D0%BD%D1%83%D0%BB", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Manoel.jpg/275px-Manoel.jpg"));
        cats.add(new Cat("Barsik", 15, "https://ru.wikipedia.org/wiki/%D0%93%D0%B5%D0%BF%D0%B0%D1%80%D0%B4", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Cheetah_Kruger.jpg/275px-Cheetah_Kruger.jpg"));
        input.put("cats", cats);

        Template template = cfg.getTemplate("index.html");

        Writer fileWriter = new FileWriter(new File("result.html"));
        template.process(input, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }
}
