package jade;

import java.security.Key;
import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

public class KeyListener {
    public static KeyListener instance;
    private boolean keyPressed[] = new boolean[350];

    // KeyListener constructor
    private KeyListener() {

    }

    // Get KeyListener function
    public static KeyListener get() {
        if (KeyListener.instance == null) {
            KeyListener.instance = new KeyListener();
        }
        return KeyListener.instance;
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods) {
        if (action == GLFW_PRESS) {
            get().keyPressed[key] = true;
        }
        else if (action == GLFW_RELEASE) {
            get().keyPressed[key] = false;
        }
    }

    // Get isKeyPressed function
    public static boolean isKeyPressed(int keyCode) {
        return get().keyPressed[keyCode];
    }
}
