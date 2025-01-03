package com.ascii;

/**
 * The AsciiMain class serves as the entry point for the Ascii Coder application.
 * It initializes the GUI for the application.
 * 
 * @author Artem Sinchuk
 * @version 1.1
 */
public class AsciiMain {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new AsciiGUI());
  }
}
