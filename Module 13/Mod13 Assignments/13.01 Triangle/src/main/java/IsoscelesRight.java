/**

import Triangle.super;

 * Extends the Triangle class to create an isosceles right triangle using the
 * special right triangles rule.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class IsoscelesRight extends Triangle {
    public IsoscelesRight(double s) {
        super(s, s, s * Math.sqrt(2));
    }
}