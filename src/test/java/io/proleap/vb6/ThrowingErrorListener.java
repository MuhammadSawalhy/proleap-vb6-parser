/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.sonatype.inject.Nullable;

public class ThrowingErrorListener extends BaseErrorListener {

	public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

	@Override
	public void syntaxError(final Recognizer<?, ?> recognizer, @Nullable final Object offendingSymbol, final int line,
			final int charPositionInLine, final String msg, @Nullable final RecognitionException e) {
		throw new RuntimeException("syntax error in line " + line + ":" + charPositionInLine + " " + msg);
	}
}