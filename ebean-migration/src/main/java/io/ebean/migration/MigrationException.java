package io.ebean.migration;

public class MigrationException extends RuntimeException {

  public MigrationException(String msg, Throwable e) {
    super(msg, e);
  }

  public MigrationException(String msg) {
    super(msg);
  }
}
