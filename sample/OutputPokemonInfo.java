package sample;

import java.util.ArrayList;
import java.util.List;

class OutputPokemonInfo {
    
    public static void main(String args[]) {

        List<PokemonInfo> pokemonList = new ArrayList<PokemonInfo>();
        
        //値のセット方法１（setterを使用）
        PokemonInfo pokemon = new PokemonInfo();
        pokemon.setMonstaerName("ピカチュー");
        pokemon.setTypeName("でんき");
        pokemon.setMove1("でんこうせっか");
        pokemon.setMove2("かみなり");
        pokemon.setMove3("１０まんボルト");
        pokemon.setMove4("ボルテッカー");
        pokemonList.add(pokemon);

        //値のセット方法２（コンストラクターを使用）
        pokemon = new PokemonInfo(
            "リザードン", 
            "ほのお、ひこう", 
            "かえんほうしゃ", 
            "ちきゅうなげ", 
            "そらをとぶ", 
            "きりさく"
        );
        pokemonList.add(pokemon);

        //値の出力
        for(PokemonInfo poke : pokemonList){
            System.out.print(
                poke.getMonstaerName() + " (" + 
                poke.getTypeName() + ") わざ：" + 
                poke.getMove1() + "," + 
                poke.getMove2() + "," + 
                poke.getMove3() + "," + 
                poke.getMove4()
            );
            System.out.print("\n");
        }

    }

}
