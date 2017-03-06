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

public int count() {

  int actorcount = 0;
  for (Actor actor : cast) {
    if (actor != null) {
      actorcount = actorcount + 1;
    }
  }
  return actorcount;
}

public void add(Actor actor) {
  if (isFull() ) {
    return;
  }
  int cast_member = this.count();
  cast[cast_member] = actor;
}

public boolean isFull() {
  return this.count() == cast.length;
}



}