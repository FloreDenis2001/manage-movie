package ro.mycode.managemovie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@Entity(name="Movie")
@Table(name="movie")

public class Movie implements Comparable<Movie>{

    @GeneratedValue ( strategy = GenerationType.AUTO)
    @Id

    private long id;
    private String titlu;
    private int anul;
    private String genul;

    @Override
    public String toString(){
        String text="Id: "+this.id+"\n";
        text+="Titlu : "+this.titlu+"\n";
        text+="Anul : "+this.anul+"\n";
        text+="Genul : "+this.genul+"\n";

        return text;
    }

    @Override
    public boolean equals(Object o){
        Movie m=(Movie) o;
        return m.getGenul().compareTo(this.getGenul())==0;
    }


    @Override
    public int compareTo(Movie o) {
        if(this.getAnul()>o.getAnul()){
            return 1;
        }else if(this.getAnul()<o.getAnul()){
            return -1;
        }else {
        return 0;
         }
    }
}
