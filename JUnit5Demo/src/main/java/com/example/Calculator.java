/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example;

public class Calculator {

	public <T extends Number> T add(T a, T b) {
		Class<?> classA = a.getClass();
		Class<?> classB = b.getClass();

		if (classA == Double.class || classB == Double.class) {
			return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
		} else {
			return (T) Integer.valueOf(a.intValue() + b.intValue());
		}
	}

	public <T extends Number> T multiply(T a, T b) {
		Class<?> classA = a.getClass();
		Class<?> classB = b.getClass();

		if (classA == Integer.class && classB == Integer.class) {
			return (T) Integer.valueOf(a.intValue() * b.intValue());
		} else {
			return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
		}
	}

}
