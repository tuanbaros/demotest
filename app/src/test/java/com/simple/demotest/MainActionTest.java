package com.simple.demotest;

import android.content.Context;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * Created by FRAMGIA\nguyen.thanh.tuan on 7/19/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActionTest {

    private MainAction mMainAction;

    @Mock
    private Action1 mAction1;

    @Mock
    private Context mContext;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        mMainAction = new MainAction(mContext, "abc", mAction1);
    }

    @Test
    public void showAbc() {
        int a = mMainAction.abc(null);
        verify(mAction1).show(mContext, a);
    }

}
