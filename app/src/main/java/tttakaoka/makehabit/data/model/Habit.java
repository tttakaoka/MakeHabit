package tttakaoka.makehabit.data.model;

import java.util.Date;

/**
 * 習慣
 */
public class Habit {

    private int id;

    private int title;
    private boolean mastered = false;
    private int continuousCount = 0;
    private Date masteredAt;
    private Date createdAt = new Date();
    private Date updatedAt = new Date();

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

}
