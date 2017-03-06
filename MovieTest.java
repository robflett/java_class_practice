import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MovieTest {

  Movie movie;
  Actor actor;

  @Before
  public void before() {
    movie = new Movie("Aliens");
    actor = new Actor();
  }

  @Test
  public void hasName() {
    assertEquals("Aliens", movie.getName() );
  }

  @Test
  public void castStartsEmpty(){
    assertEquals(0, movie.count() );
  }

  @Test
  public void canAddActors() {
    movie.add(new Actor() );
    assertEquals(1, movie.count() );
  }

  @Test
  public void isFull(){

    for (int i = 0; i < 9; i++) {

      movie.add(actor);

    }

    assertEquals(true, movie.isFull() );
  }
}