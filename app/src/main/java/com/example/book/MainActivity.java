package com.example.book;


import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import java.util.UUID;


public class MainActivity extends SingleFragmentActivity {

    public static final String EXTRA_BOOK_ID = "ru.rsue.android.bookdepository.book_id";
    public static Intent newIntent(Context packageContext, UUID bookId)
    {
        Intent intent = new Intent(packageContext, MainActivity.class);
        intent.putExtra(EXTRA_BOOK_ID, bookId);
        return intent;
    }
    @Override
    protected  Fragment createFragment(){
        UUID bookId = (UUID) getIntent().getSerializableExtra(EXTRA_BOOK_ID);
        return BookFragment.newInstance(bookId);
    }
}
