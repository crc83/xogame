package org.crc83.xogame;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

/**
 * Hello world!
 *
 */
public class App extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Basic Game App");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
