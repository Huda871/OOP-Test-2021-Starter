package ie.tudublin;

import processing.data.TableRow;

public class Note {
    private char note;
    private int duration;

    public char getNote() {
        return note;
    }
    public void setNote(char note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    /*public Note(TableRow r)
    {
        this(r.get("Note"), r.getInt("duration"));
    }*/
    
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }

   
    


    
    
}


