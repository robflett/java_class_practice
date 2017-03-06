class Movie {

  private String name;
  private Actor[] cast;


public Movie(String name){
  this.name = name;
  this.cast = new Actor[9];
}

public String getName() {
  return this.name;
}

public int castSize() {
  int count = 0;
  for (Actor actor : cast) {
    if (actor != null) {
      count = count++;
    }
  }
  return count;
}


}