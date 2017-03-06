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
    assertEquals(0, movie.castSize() );
  }
}