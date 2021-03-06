package BoxInABox

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Joseph on 22/01/2016.
 */
class TradingUnitTest extends FlatSpec with Matchers{

  "Trading Solver Brute Force " should "return the best pair of trades, in chronological order" in {
    val tradingSolver = new TradingSolverBruteForce(List(19.35, 19.30, 18.88, 18.93, 18.95, 19.03, 19.00, 18.97, 18.97, 18.98))
    val result = tradingSolver.solve
    result shouldBe BuySellPair(18.88, 19.03)
  }

  it should "return the best pair of trades, in chronological order with a much larger result set" in {
    val tradingSolver = new TradingSolverBruteForce(List(9.20, 8.03, 10.02, 8.08, 8.14, 8.10, 8.31, 8.28, 8.35, 8.34,
      8.39, 8.45, 8.38, 8.38, 8.32, 8.36, 8.28, 8.28, 8.38, 8.48, 8.49, 8.54, 8.73, 8.72, 8.76, 8.74, 8.87,
      8.82, 8.81, 8.82, 8.85, 8.85, 8.86, 8.63, 8.70, 8.68, 8.72, 8.77, 8.69, 8.65, 8.70, 8.98, 8.98, 8.87,
      8.71, 9.17, 9.34, 9.28, 8.98, 9.02, 9.16, 9.15, 9.07, 9.14, 9.13, 9.10, 9.16, 9.06, 9.10, 9.15, 9.11,
      8.72, 8.86, 8.83, 8.70, 8.69, 8.73, 8.73, 8.67, 8.70, 8.69, 8.81, 8.82, 8.83, 8.91, 8.80, 8.97, 8.86,
      8.81, 8.87, 8.82, 8.78, 8.82, 8.77, 8.54, 8.32, 8.33, 8.32, 8.51, 8.53, 8.52, 8.41, 8.55, 8.31, 8.38,
      8.34, 8.34, 8.19, 8.17, 8.16))
    val result = tradingSolver.solve
    result shouldBe BuySellPair(8.03, 9.34)
  }

  "Trading Solver Smarter " should "return the best pair of trades, in chronological order" in {
    val tradingSolver = new TradingSolverSmarter(List(19.35, 19.30, 18.88, 18.93, 18.95, 19.03, 19.00, 18.97, 18.97, 18.98))
    val result = tradingSolver.solve()
    result shouldBe BuySellPair(18.88, 19.03)
  }

  it should "return the best pair of trades, in chronological order with a much larger result set" in {
    val tradingSolver = new TradingSolverSmarter(List(9.20, 8.03, 10.02, 8.08, 8.14, 8.10, 8.31, 8.28, 8.35, 8.34,
      8.39, 8.45, 8.38, 8.38, 8.32, 8.36, 8.28, 8.28, 8.38, 8.48, 8.49, 8.54, 8.73, 8.72, 8.76, 8.74, 8.87,
      8.82, 8.81, 8.82, 8.85, 8.85, 8.86, 8.63, 8.70, 8.68, 8.72, 8.77, 8.69, 8.65, 8.70, 8.98, 8.98, 8.87,
      8.71, 9.17, 9.34, 9.28, 8.98, 9.02, 9.16, 9.15, 9.07, 9.14, 9.13, 9.10, 9.16, 9.06, 9.10, 9.15, 9.11,
      8.72, 8.86, 8.83, 8.70, 8.69, 8.73, 8.73, 8.67, 8.70, 8.69, 8.81, 8.82, 8.83, 8.91, 8.80, 8.97, 8.86,
      8.81, 8.87, 8.82, 8.78, 8.82, 8.77, 8.54, 8.32, 8.33, 8.32, 8.51, 8.53, 8.52, 8.41, 8.55, 8.31, 8.38,
      8.34, 8.34, 8.19, 8.17, 8.16))
    val result = tradingSolver.solve()
    result shouldBe BuySellPair(8.03, 9.34)
  }
}
