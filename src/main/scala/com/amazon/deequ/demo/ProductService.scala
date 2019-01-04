package com.amazon.deequ.demo

object ProductService {

  private[this] val CARDINALITIES: Map[(String, String), Long] = Map(
    ("01", "Video Games") -> 928,
    ("01", "Shoes") -> 4098,
    ("01", "Jewelry") -> 1608,
    ("01", "Beauty") -> 6236,
    ("02", "Video Games") -> 1757,
    ("02", "Shoes") -> 8926,
    ("02", "Jewelry") -> 3325,
    ("02", "Beauty") -> 11894,
    ("03", "Video Games") -> 2742,
    ("03", "Shoes") -> 15723,
    ("03", "Jewelry") -> 5750,
    ("03", "Beauty") -> 18611,
    ("04", "Video Games") -> 4412,
    ("04", "Shoes") -> 23152,
    ("04", "Jewelry") -> 8364,
    ("04", "Beauty") -> 28965,
    ("05", "Video Games") -> 5762,
    ("05", "Shoes") -> 30081,
    ("05", "Jewelry") -> 10743,
    ("05", "Beauty") -> 37319,
    ("06", "Video Games") -> 6959,
    ("06", "Shoes") -> 37072,
    ("06", "Jewelry") -> 13132,
    ("06", "Beauty") -> 45140,
    ("07", "Video Games") -> 8105,
    ("07", "Shoes") -> 43040,
    ("07", "Jewelry") -> 15454,
    ("07", "Beauty") -> 52563,
    ("08", "Video Games") -> 9085,
    ("08", "Shoes") -> 47110,
    ("08", "Jewelry") -> 17036,
    ("08", "Beauty") -> 58974,
    ("09", "Video Games") -> 10161,
    ("09", "Shoes") -> 52106,
    ("09", "Jewelry") -> 18750,
    ("09", "Beauty") -> 66010,
    ("10", "Video Games") -> 11353,
    ("10", "Shoes") -> 59126,
    ("10", "Jewelry") -> 21199,
    ("10", "Beauty") -> 74190,
    ("11", "Video Games") -> 12692,
    ("11", "Shoes") -> 66108,
    ("11", "Jewelry") -> 23691,
    ("11", "Beauty") -> 82542,
    ("12", "Video Games") -> 13847,
    ("12", "Shoes") -> 72867,
    ("12", "Jewelry") -> 25980,
    ("12", "Beauty") -> 90450,
    ("13", "Video Games") -> 14981,
    ("13", "Shoes") -> 79505,
    ("13", "Jewelry") -> 28216,
    ("13", "Beauty") -> 98186,
    ("14", "Video Games") -> 16084,
    ("14", "Shoes") -> 85057,
    ("14", "Jewelry") -> 30417,
    ("14", "Beauty") -> 105356,
    ("15", "Video Games") -> 17066,
    ("15", "Shoes") -> 89084,
    ("15", "Jewelry") -> 32004,
    ("15", "Beauty") -> 111796,
    ("16", "Video Games") -> 17920,
    ("16", "Shoes") -> 93677,
    ("16", "Jewelry") -> 33665,
    ("16", "Beauty") -> 116970,
    ("17", "Video Games") -> 19349,
    ("17", "Shoes") -> 100933,
    ("17", "Jewelry") -> 36255,
    ("17", "Beauty") -> 125628,
    ("18", "Video Games") -> 20796,
    ("18", "Shoes") -> 107689,
    ("18", "Jewelry") -> 38829,
    ("18", "Beauty") -> 135280,
    ("19", "Video Games") -> 21950,
    ("19", "Shoes") -> 114415,
    ("19", "Jewelry") -> 41205,
    ("19", "Beauty") -> 143425,
    ("20", "Video Games") -> 23128,
    ("20", "Shoes") -> 121541,
    ("20", "Jewelry") -> 43652,
    ("20", "Beauty") -> 151456,
    ("21", "Video Games") -> 24232,
    ("21", "Shoes") -> 127092,
    ("21", "Jewelry") -> 45742,
    ("21", "Beauty") -> 159265,
    ("22", "Video Games") -> 25211,
    ("22", "Shoes") -> 131206,
    ("22", "Jewelry") -> 47399,
    ("22", "Beauty") -> 165907,
    ("23", "Video Games") -> 26118,
    ("23", "Shoes") -> 135932,
    ("23", "Jewelry") -> 49067,
    ("23", "Beauty") -> 172658,
    ("24", "Video Games") -> 27262,
    ("24", "Shoes") -> 142956,
    ("24", "Jewelry") -> 51532,
    ("24", "Beauty") -> 181126,
    ("25", "Video Games") -> 28811,
    ("25", "Shoes") -> 149942,
    ("25", "Jewelry") -> 54076,
    ("25", "Beauty") -> 189274,
    ("26", "Video Games") -> 29997,
    ("26", "Shoes") -> 156422,
    ("26", "Jewelry") -> 56291,
    ("26", "Beauty") -> 196926,
    ("27", "Video Games") -> 31281,
    ("27", "Shoes") -> 163114,
    ("27", "Jewelry") -> 58801,
    ("27", "Beauty") -> 205093,
    ("28", "Video Games") -> 32222,
    ("28", "Shoes") -> 168632,
    ("28", "Jewelry") -> 60888,
    ("28", "Beauty") -> 211773,
    ("29", "Video Games") -> 33217,
    ("29", "Shoes") -> 172743,
    ("29", "Jewelry") -> 62446,
    ("29", "Beauty") -> 218728,
    ("30", "Video Games") -> 34247,
    ("30", "Shoes") -> 177474,
    ("30", "Jewelry") -> 64109,
    ("30", "Beauty") -> 225530,
    ("31", "Video Games") -> 35490,
    ("31", "Shoes") -> 184091,
    ("31", "Jewelry") -> 66307,
    ("31", "Beauty") -> 233644)

  def getNumAvailableProducts(day: String, category: String): Long = {
    CARDINALITIES.getOrElse((day, category), 0L)
  }

}