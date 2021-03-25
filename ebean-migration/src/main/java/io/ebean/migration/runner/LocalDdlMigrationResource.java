package io.ebean.migration.runner;

import io.ebean.migration.MigrationVersion;
import io.avaje.classpath.scanner.Resource;

import javax.annotation.Nonnull;

/**
 * A DB migration resource (DDL script with version).
 */
public class LocalDdlMigrationResource extends LocalMigrationResource {

  private final Resource resource;

  /**
   * Construct with version and resource.
   */
  public LocalDdlMigrationResource(MigrationVersion version, String location, Resource resource) {
    super(version, location);
    this.resource = resource;
  }

  /**
   * Return the content for the migration apply ddl script.
   */
  @Nonnull
  public String getContent() {
    return resource.loadAsString("UTF-8");
  }

}
