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
   @return return
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
   @return info.
 */
String info();
}
