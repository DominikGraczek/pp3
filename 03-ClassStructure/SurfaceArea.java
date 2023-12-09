public class SurfaceArea {
    final static float PI = 3.14f;

    static float rectangle(float a, float b) {
        return a * b;
    }

    static float triangle(float a, float h) {
        return a * h / 2;
    }

    static float circle(float radius) {
        return radius * radius * PI;
    }
}
