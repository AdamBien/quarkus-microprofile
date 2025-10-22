/**
 * REST resources and their corresponding MicroProfile REST client interfaces for system testing.
 * <p>
 * The REST client interfaces reside in the same package as the resources under test to maintain
 * clear correspondence and simplify testing setup. This co-location makes it explicit which client
 * tests which resource and reduces navigation overhead during test development.
 * <p>
 * All MicroProfile REST client interfaces in this source directory (src/main/java) are packaged into a jar and can be
 * reused as clients by other services.
 */
package airhacks.qmp.greetings.boundary;
