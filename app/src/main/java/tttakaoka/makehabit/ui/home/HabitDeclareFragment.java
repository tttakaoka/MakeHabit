package tttakaoka.makehabit.ui.home;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tttakaoka.makehabit.R;

/**
 * 習慣を宣言するView
 */
public class HabitDeclareFragment extends Fragment {

    public HabitDeclareFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_habit_declare, container, false);
    }
}
