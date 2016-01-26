package tttakaoka.makehabit.data.model;

import java.util.Date;

import io.realm.annotations.PrimaryKey;

/**
 * Realm Habitクラス
 */
public class RealmHabit {

    @PrimaryKey
    private int id;

    private int title;
    private boolean mastered = false;
    private int continuousCount = 0;
    private Date masteredAt;
    private Date createdAt = new Date();
    private Date updatedAt = new Date();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public boolean isMastered() {
        return mastered;
    }

    public void setMastered(boolean mastered) {
        this.mastered = mastered;
    }

    public int getContinuousCount() {
        return continuousCount;
    }

    public void setContinuousCount(int continuousCount) {
        this.continuousCount = continuousCount;
    }

    public Date getMasteredAt() {
        return masteredAt;
    }

    public void setMasteredAt(Date masteredAt) {
        this.masteredAt = masteredAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
