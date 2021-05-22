package com.example.feedbackapp.Adapter;

import com.example.feedbackapp.model.Class;
import com.example.feedbackapp.model.Module;
import com.example.feedbackapp.model.Topic;

import java.util.ArrayList;
import java.util.List;

public class ClassDataUtils {

    public static List<Class> getClasss( ) {
        Class class1 = new Class(1, "Class1");
        Class class2 = new Class(2, "Class2");
        Class class3 = new Class(3, "Class3");
        Class class4 = new Class(4, "Class4");
        Class class5 = new Class(5, "Class5");

        List<Class> list = new ArrayList<Class>();
        list.add(class1);
        list.add(class2);
        list.add(class3);
        list.add(class4);
        list.add(class5);

        return list;
    }
    public static List<Module> getModule( ) {
        Module Module1 = new Module(1, "Module1");
        Module Module2 = new Module(2, "Module2");
        Module Module3 = new Module(3, "Module3");
        Module Module4 = new Module(4, "Module4");
        Module Module5 = new Module(5, "Module5");

        List<Module> list = new ArrayList<Module>();
        list.add(Module1);
        list.add(Module2);
        list.add(Module3);
        list.add(Module4);
        list.add(Module5);

        return list;
    }
    public static List<Topic> getTopic(){
        Topic Topic1 = new Topic(1, "Topic1");
        Topic Topic2 = new Topic(2, "Topic2");
        Topic Topic3 = new Topic(3, "Topic3");
        Topic Topic4 = new Topic(4, "Topic4");
        Topic Topic5 = new Topic(5, "Topic5");
        List <Topic> list = new ArrayList<Topic>();
        list.add(Topic1);
        list.add(Topic3);
        list.add(Topic3);
        list.add(Topic4);
        list.add(Topic5);
        return list;
    }
}
