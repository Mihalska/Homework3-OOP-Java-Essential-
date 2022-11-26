package task2;

public class ClassRoom {
    static Pupil[] abc = new Pupil[4];
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;


    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
        abc[0] = this.pupil1;
        abc[1] = this.pupil2;
        abc[2] = this.pupil3;
        abc[3] = this.pupil4;




    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        abc[0] = this.pupil1;
        abc[1] = this.pupil2;
        abc[2] = this.pupil3;

    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        abc[0] = this.pupil1;
        abc[1] = this.pupil2;
    }

}























