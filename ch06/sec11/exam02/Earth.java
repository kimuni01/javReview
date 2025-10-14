package ch06.sec11.exam02;

public class Earth {
    // declaring and initializing constant
    static final double EARTH_RADIUS = 6400;

    // declaring a constant
    static final double EARTH_SURFACE_AREA;

    // initializing constant at static block
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    } // Math.PI is a constant provided by Java
}
