/**
   package-info.
 */
package ru.job4j.tracker;
/**
   interface info.
 */
interface IUserAction {
/**
   method key.
 */
int key();
/**
   method execute.
   @param input input
   @param tracker tracker.
 */
void execute(Input input, Tracker tracker);
/**
   method info.
 */
String info();
}
