package org.nd4j.linalg;


import org.nd4j.linalg.factory.Nd4jBackend;

/**
 * Base class for all normal ndarray tests
 * Any tests here will share ordering (such as vectors)
 *
 * @author Adam Gibson
 */
public class BaseNDArrayTests extends BaseNd4jTest {
    public BaseNDArrayTests() {
    }

    public BaseNDArrayTests(Nd4jBackend backend) {
        super(backend);
    }

    public BaseNDArrayTests(String name) {
        super(name);
    }

    public BaseNDArrayTests(String name, Nd4jBackend backend) {
        super(name, backend);
    }
}
