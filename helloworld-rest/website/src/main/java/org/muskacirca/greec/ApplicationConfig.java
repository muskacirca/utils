package org.muskacirca.greec;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rs")
public class
ApplicationConfig extends Application {

    // ======================================
    // =          Business methods          =
    // ======================================

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(HelloWorld.class);
        return classes;
    }
}
