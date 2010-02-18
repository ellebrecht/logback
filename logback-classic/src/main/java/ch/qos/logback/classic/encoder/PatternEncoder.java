package ch.qos.logback.classic.encoder;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.PatternEncoderBase;

public class PatternEncoder extends PatternEncoderBase<ILoggingEvent> {

  public void start() {
    layout = new PatternLayout();
    layout.setContext(context);
    layout.setPattern(getPattern());
    layout.start();
  }
   
}