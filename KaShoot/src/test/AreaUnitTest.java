package tests;
import com.ITMOcourse2.*;

import org.junit.*;
//import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AreaUnitTest {


    //@Rule
    //public ExpectedException thrown = ExpectedException.none();

    Shot shot01 = new Shot(0, 0, 3); // центр фигуры - true
    Shot shot02 = new Shot(-1, 2, 1); // IV квадрант, пустой - false
    Shot shot11 = new Shot(0.5, 1, 1); // угол прямоугольника в I квадранте - true
    Shot shot12 = new Shot(0, 2, 2.5); // грань прямоугольника - true
    Shot shot13 = new Shot(1.5, 0, 3); // угол прямоугольника - true
    Shot shot14 = new Shot(0.3333, 1, 2.5); // внутри прямоугольника - true
    Shot shot15 = new Shot(1, 3, 2); // точка вне прямоугольника - false
    Shot shot21 = new Shot(0, -1, 2); // нижняя точка окружности в II квадранте - true
    Shot shot22 = new Shot(1.0, 1, 2); // точка на границе окружности - true
    Shot shot23 = new Shot(1.16, -1, 3); // точка внутри окружности - true
    Shot shot24 = new Shot(0.6, -2, 1); // точка вне окружности - false
    Shot shot31 = new Shot(-2.5, 0, 2.5); // крайняя точка треугольника в III квадранте - true
    Shot shot32 = new Shot(0.333, -1, 3); // точка на гипотенузе - true
    Shot shot33 = new Shot(-0.7, -1, 2.5); // точка вне треугольника - false

    @Test
    public void centerShot() {
        assertThat(shot01.shotSuccess(), is(true));
    }

    @Test
    public void quadrantIV() {
        assertThat(shot02.shotSuccess(), is(false));
    }

    @Test
    public void quadrantI() {
        assertThat(shot11.shotSuccess(), is(true));
        assertThat(shot12.shotSuccess(), is(true));
        assertThat(shot13.shotSuccess(), is(true));
        assertThat(shot14.shotSuccess(), is(true)); //t
        assertThat(shot15.shotSuccess(), is(false));
    }

    @Test
    public void quadrantII() {
        assertThat(shot21.shotSuccess(), is(true));
        assertThat(shot22.shotSuccess(), is(true));
        assertThat(shot23.shotSuccess(), is(true));
        assertThat(shot24.shotSuccess(), is(false));
    }

    @Test
    public void quadrantIII() {
        assertThat(shot31.shotSuccess(), is(true));
        assertThat(shot32.shotSuccess(), is(true));
        assertThat(shot33.shotSuccess(), is(false));
    }
}
