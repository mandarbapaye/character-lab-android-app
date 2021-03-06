package org.characterlab.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import org.characterlab.android.fragments.AssessmentCardFragment;
import org.characterlab.android.models.Strength;

/**
 * Created by mandar.b on 7/9/2014.
 */
public class AssessmentCardsAdapter extends SmartFragmentStatePagerAdapter  {

    private static int NUM_ITEMS = 7;

    public AssessmentCardsAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public float getPageWidth (int position)
    {
        return 1.0f;
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return createAssessmentCardFragment(Strength.CURIOSITY, position);
            case 1:
                return createAssessmentCardFragment(Strength.GRATITUDE, position);
            case 2:
                return createAssessmentCardFragment(Strength.GRIT, position);
            case 3:
                return createAssessmentCardFragment(Strength.OPTIMISM, position);
            case 4:
                return createAssessmentCardFragment(Strength.SELF_CONTROL, position);
            case 5:
                return createAssessmentCardFragment(Strength.SOCIAL_INTELLIGENCE, position);
            case 6:
                return createAssessmentCardFragment(Strength.ZEST, position);
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Character " + (position + 1);
    }

    private AssessmentCardFragment createAssessmentCardFragment(Strength strength, int position) {
        AssessmentCardFragment cardFragment = AssessmentCardFragment.newInstance(strength, position);
        return cardFragment;
    }


}

