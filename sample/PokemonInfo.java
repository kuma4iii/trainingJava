package sample;

public class PokemonInfo {
    
    private String monstaerName;

    private String typeName;

    private String move1;

    private String move2;

    private String move3;

    private String move4;

    PokemonInfo(){
        //NOP
    }

    PokemonInfo(String monstaerName, String typeName, String move1, String move2, String move3, String move4) {
        this.monstaerName = monstaerName;
        this.typeName = typeName;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public String getMonstaerName() {
        return monstaerName;
    }

    public void setMonstaerName(String monstaerName) {
        this.monstaerName = monstaerName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getMove1() {
        return move1;
    }

    public void setMove1(String move1) {
        this.move1 = move1;
    }

    public String getMove2() {
        return move2;
    }

    public void setMove2(String move2) {
        this.move2 = move2;
    }

    public String getMove3() {
        return move3;
    }

    public void setMove3(String move3) {
        this.move3 = move3;
    }

    public String getMove4() {
        return move4;
    }

    public void setMove4(String move4) {
        this.move4 = move4;
    }

}
