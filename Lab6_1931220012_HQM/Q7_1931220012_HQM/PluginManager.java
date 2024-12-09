
import java.util.ArrayList;
import java.util.List;

public class PluginManager {

    List<IPlugin> plugins;

    public PluginManager() {
        plugins = new ArrayList<>();
    }

    // Register a new plugin
    public void addPlugin(IPlugin plugin) {
        plugins.add(plugin);
    }

    // Excute all plugins
    public void excuteAllPlugins() {
        for (IPlugin plugin : plugins) {
            plugin.excute();
        }
    }

}
