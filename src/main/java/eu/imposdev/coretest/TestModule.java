package eu.imposdev.coretest;

import eu.imposdev.coretest.listener.PlayerJoinListener;
import eu.imposdev.modularcore.ModularCore;
import eu.imposdev.modularcore.module.Module;

public class TestModule extends Module {

    private static TestModule instance;

    private ModularCore coreInstance;

    @Override
    public void onLoad() {
        instance = this;
        coreInstance = this.getCorePlugin();
        this.getLogger().info("onLoad called!");
        registerListener(new PlayerJoinListener());
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Module loaded successfully!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Disabling plugin...");
    }

    @Override
    protected String getName() {
        return "TestModule";
    }

    public static TestModule getInstance() {
        return instance;
    }

    public ModularCore getSkyBlockInstance() {
        return coreInstance;
    }
}
