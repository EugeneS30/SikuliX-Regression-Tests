package com.eugenes.functional.configuration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.Clock;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;

import com.eugenes.functional.configuration.WebDriverEnvironment;

import com.google.common.base.Function;

/**
 * An implementation of {@link FluentWait} which injects the hostname of a remote webdriver into the
 * timeout message.
 *
 * This implementation is required so that the standard message, detailing what was waited for, is
 * not clobbered - which would be the case if {@link FluentWait#withMessage(String)} was used.
 *
 * <p>
 * <b>This class is not threadsafe. Calling {@link #until(Function)} from multiple threads can
 * garble the timeout message - mis-reporting the function being tested</b>
 * </p>
 *
 * @author tim.myerscough
 *
 * @param <T>
 *            The input type for each condition used with this instance.
 */
public class RemoteFluentWait<T> extends FluentWait<T> {

    private WebDriverEnvironment env;

    public RemoteFluentWait(final T input, final Clock clock, final Sleeper sleeper) {
        super(input, clock, sleeper);
    }

    public RemoteFluentWait(final T input) {
        super(input);
    }

    public RemoteFluentWait<T> withEnvironment(final WebDriverEnvironment e) {
        this.env = e;
        return this;
    }

    @Override
    public <V> V until(final Function<? super T, V> isTrue) {

        try {
            return super.until(isTrue);

        } catch (TimeoutException e) {
            // Wrap the exception if possible with the node information
            if (env != null) {
                throw new TimeoutException("Timed out on host: " + env.getHostname(), e);
            } else {
                throw e;
            }
        }
    }
}
