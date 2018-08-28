package seal.com.testopenglchoose;

class GLES3JNILib {
    static {
        System.loadLibrary("native-lib");
    }

    public static native void init();
    public static native void resize(int width, int height);
    public static native void step();
}
