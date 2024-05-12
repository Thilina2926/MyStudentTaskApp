package com.example.testmad01.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StudentDao_Impl implements StudentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Student> __insertionAdapterOfStudent;

  private final EntityDeletionOrUpdateAdapter<Student> __deletionAdapterOfStudent;

  private final EntityDeletionOrUpdateAdapter<Student> __updateAdapterOfStudent;

  public StudentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStudent = new EntityInsertionAdapter<Student>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `student_table` (`SID`,`name`,`age`,`faculty`,`year`,`GPA`,`task`,`id`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Student value) {
        if (value.getSID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSID());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAge() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAge());
        }
        if (value.getFaculty() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFaculty());
        }
        if (value.getYear() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getYear());
        }
        if (value.getGPA() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGPA());
        }
        if (value.getTask() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTask());
        }
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getId());
        }
      }
    };
    this.__deletionAdapterOfStudent = new EntityDeletionOrUpdateAdapter<Student>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `student_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Student value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfStudent = new EntityDeletionOrUpdateAdapter<Student>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `student_table` SET `SID` = ?,`name` = ?,`age` = ?,`faculty` = ?,`year` = ?,`GPA` = ?,`task` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Student value) {
        if (value.getSID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSID());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAge() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAge());
        }
        if (value.getFaculty() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFaculty());
        }
        if (value.getYear() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getYear());
        }
        if (value.getGPA() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGPA());
        }
        if (value.getTask() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTask());
        }
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getId());
        }
      }
    };
  }

  @Override
  public Object addStudent(final Student student, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStudent.insert(student);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insert(final Student student, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStudent.insert(student);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteStudent(final Student student,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStudent.handle(student);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Student student, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStudent.handle(student);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateStudent(final Student student,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfStudent.handle(student);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<Student> getAllStudents() {
    final String _sql = "SELECT * FROM student_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSID = CursorUtil.getColumnIndexOrThrow(_cursor, "SID");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
      final int _cursorIndexOfFaculty = CursorUtil.getColumnIndexOrThrow(_cursor, "faculty");
      final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
      final int _cursorIndexOfGPA = CursorUtil.getColumnIndexOrThrow(_cursor, "GPA");
      final int _cursorIndexOfTask = CursorUtil.getColumnIndexOrThrow(_cursor, "task");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<Student> _result = new ArrayList<Student>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Student _item;
        final String _tmpSID;
        if (_cursor.isNull(_cursorIndexOfSID)) {
          _tmpSID = null;
        } else {
          _tmpSID = _cursor.getString(_cursorIndexOfSID);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpAge;
        if (_cursor.isNull(_cursorIndexOfAge)) {
          _tmpAge = null;
        } else {
          _tmpAge = _cursor.getString(_cursorIndexOfAge);
        }
        final String _tmpFaculty;
        if (_cursor.isNull(_cursorIndexOfFaculty)) {
          _tmpFaculty = null;
        } else {
          _tmpFaculty = _cursor.getString(_cursorIndexOfFaculty);
        }
        final String _tmpYear;
        if (_cursor.isNull(_cursorIndexOfYear)) {
          _tmpYear = null;
        } else {
          _tmpYear = _cursor.getString(_cursorIndexOfYear);
        }
        final String _tmpGPA;
        if (_cursor.isNull(_cursorIndexOfGPA)) {
          _tmpGPA = null;
        } else {
          _tmpGPA = _cursor.getString(_cursorIndexOfGPA);
        }
        final String _tmpTask;
        if (_cursor.isNull(_cursorIndexOfTask)) {
          _tmpTask = null;
        } else {
          _tmpTask = _cursor.getString(_cursorIndexOfTask);
        }
        _item = new Student(_tmpSID,_tmpName,_tmpAge,_tmpFaculty,_tmpYear,_tmpGPA,_tmpTask);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
