package com.epam.jc.task6;

import com.epam.jc.task7.MyFirstAnnotation;

/**
 * @author Vladislav Boboshko
 */

@MyFirstAnnotation(author = "Vladimir Lenin")
public class AtomicSubmarine {
    private String name;
    private boolean state;

    public AtomicSubmarineEngine getEngine() {
        return engine;
    }

    private AtomicSubmarineEngine engine;

    public AtomicSubmarine() {
        this("Kursk");
    }

    public AtomicSubmarine(String name) {
        this.name = name;
        engine = new AtomicSubmarineEngine();
    }

    public boolean powerOn() {
        return state = engine.isPowered();
    }

    public void powerOff() {
        engine.powerOff();
        state = false;
    }

    public boolean isState() {
        return state;
    }

    class AtomicSubmarineEngine {
        private boolean state;

        public boolean powerOn() {
            return state = true;
        }

        public void powerOff() {
            state = false;
        }

        public boolean isPowered() {
            return state;
        }
    }
}
