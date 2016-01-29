package tttakaoka.makehabit.data.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 各習慣に紐付くメモ
 */
public class Memo implements Parcelable {
    public int id;
    public String body;

    protected Memo(Parcel in) {
        id = in.readInt();
        body = in.readString();
    }

    public static final Creator<Memo> CREATOR = new Creator<Memo>() {
        @Override
        public Memo createFromParcel(Parcel in) {
            return new Memo(in);
        }

        @Override
        public Memo[] newArray(int size) {
            return new Memo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(body);
    }
}
