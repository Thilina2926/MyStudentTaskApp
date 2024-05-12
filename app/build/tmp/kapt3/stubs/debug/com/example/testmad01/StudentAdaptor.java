package com.example.testmad01;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001cH\u0017J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001cH\u0016R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/example/testmad01/StudentAdaptor;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/testmad01/StudentViewHolder;", "items", "", "Lcom/example/testmad01/database/Student;", "repository", "Lcom/example/testmad01/database/StudentRepository;", "viewModel", "Lcom/example/testmad01/MainActivityData;", "(Ljava/util/List;Lcom/example/testmad01/database/StudentRepository;Lcom/example/testmad01/MainActivityData;)V", "colors", "", "", "[Ljava/lang/String;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getItems", "()Ljava/util/List;", "getRepository", "()Lcom/example/testmad01/database/StudentRepository;", "getViewModel", "()Lcom/example/testmad01/MainActivityData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class StudentAdaptor extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.testmad01.StudentViewHolder> {
    @org.jetbrains.annotations.Nullable
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.testmad01.database.Student> items = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.testmad01.database.StudentRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.testmad01.MainActivityData viewModel = null;
    private final java.lang.String[] colors = {"#E1BEE7", "#D1C4E9", "#C5CAE9", "#BBDEFB", "#B3E5FC", "#B2EBF2", "#B2DFDB", "#C8E6C9"};
    
    public StudentAdaptor(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.testmad01.database.Student> items, @org.jetbrains.annotations.NotNull
    com.example.testmad01.database.StudentRepository repository, @org.jetbrains.annotations.NotNull
    com.example.testmad01.MainActivityData viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.testmad01.database.Student> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.testmad01.database.StudentRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.testmad01.MainActivityData getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.testmad01.StudentViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.testmad01.StudentViewHolder holder, int position) {
    }
}