package com.sdabyd2.programowanie;


import com.sdabyd2.programowanie.controler.GiantController;
import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Norishment;
import com.sdabyd2.programowanie.view.GiantView;

public class Main {

        public static void main(String[] args) {

            GiantModel giant1 = new GiantModel(
                    Health.HEALTHY,
                    Norishment.NOTHUNGRY,
                    Fatigue.NO
            );

            GiantView view = new GiantView();
            GiantController controller = new GiantController(
                    giant1, view
            );

            controller.updateView();

            controller.setHealth(Health.DEAD);
            controller.updateView();
}
    }
