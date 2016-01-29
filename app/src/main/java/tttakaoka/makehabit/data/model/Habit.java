package tttakaoka.makehabit.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * 習慣
 */
public class Habit implements Parcelable {

    public int id;
    public int title;
    public boolean mastered = false;
    public int continuousCount = 0;
    public Date masteredAt;
    public Date createdAt = new Date();
    public Date updatedAt = new Date();

    public Habit(RealmHabit realmHabit) {
        this.id = realmHabit.getId();
        this.title = realmHabit.getTitle();
        this.mastered = realmHabit.isMastered();
        this.continuousCount = realmHabit.getContinuousCount();
        this.masteredAt = realmHabit.getMasteredAt();
        this.createdAt = realmHabit.getCreatedAt();
        this.updatedAt = realmHabit.getUpdatedAt();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public int getTitle() {
        return title;
    }

    public boolean isMastered() {
        return mastered;
    }

    public int getContinuousCount() {
        return continuousCount;
    }

    public Date getMasteredAt() {
        return masteredAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    protected Habit(Parcel in) {
        id = in.readInt();
        title = in.readInt();
        mastered = in.readByte() != 0;
        continuousCount = in.readInt();
        masteredAt = new Date(in.readLong());
        createdAt = new Date(in.readLong());
        updatedAt = new Date(in.readLong());
    }

    public static final Creator<Habit> CREATOR = new Creator<Habit>() {
        @Override
        public Habit createFromParcel(Parcel in) {
            return new Habit(in);
        }

        @Override
        public Habit[] newArray(int size) {
            return new Habit[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(title);
        dest.writeByte((byte) (mastered ? 1 : 0));
        dest.writeInt(continuousCount);
        dest.writeLong(masteredAt.getTime());
        dest.writeLong(createdAt.getTime());
        dest.writeLong(updatedAt.getTime());
    }
}
