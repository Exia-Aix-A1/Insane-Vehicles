package fr.exia.insanevehicles.prosit3.element.mobile;

import fr.exia.insanevehicles.prosit3.Road;
import fr.exia.insanevehicles.prosit3.element.Permeability;

import java.io.IOException;

/**
 * <h1>The Class MyVehicle.</h1>
 *
 * @author Jade
 * @version 0.1
 */
public class MyVehicle extends Mobile {

    /** The Constant SPRITE. */
    private static final char SPRITE = 'H';
    private static final String IMAGE = "Monster4.png";

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param road
     *            the road
     */
    public MyVehicle(final int x, final int y, final Road road) throws IOException{
        super(x, y, IMAGE, road, Permeability.BLOCKING);
    }
}
