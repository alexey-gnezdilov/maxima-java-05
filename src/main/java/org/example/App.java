package org.example;

public class App 
{
    public static void main( String[] args )  {
        try {
            DynamicPage.createPage("templates");
        } catch (Exception e) {}
    }
}