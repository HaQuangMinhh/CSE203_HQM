
public class Q7Main {

    public static void main(String[] args) {

        PluginManager plugin = new PluginManager();

        // Register
        plugin.addPlugin(new SavePlugin());
        plugin.addPlugin(new PrintPlugin());

        // Excute 
        plugin.excuteAllPlugins();

    }

}
