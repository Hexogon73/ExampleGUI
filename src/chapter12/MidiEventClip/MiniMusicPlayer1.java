package chapter12.MidiEventClip;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.*;

/* Head First Java/page 419
* урощение добавления эвентов - создание статик метода
* */

public class MiniMusicPlayer1 {

    public static void main(String[] args) {
        MiniMusicPlayer1 mini = new MiniMusicPlayer1();
        mini.play();
    }

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer(); //получаем синтезатор и открываем его
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4); //создаем последовательность
            Track track = seq.createTrack(); //запрашиваем трек у последовательности
            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}

//Старый код
//            ShortMessage a = new ShortMessage(); //создаем midi события
//            a.setMessage(144, 1, 44, 100);
//            MidiEvent noteOn = new MidiEvent(a, 1);
//            track.add(noteOn); //помещаем событие в трек
//
//            ShortMessage b = new ShortMessage();
//            b.setMessage(128, 1, 44, 100);
//            MidiEvent noteOff = new MidiEvent(b, 16);
//            track.add(noteOff);