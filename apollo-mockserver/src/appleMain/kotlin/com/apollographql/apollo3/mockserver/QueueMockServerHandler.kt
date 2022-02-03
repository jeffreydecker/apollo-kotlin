package com.apollographql.apollo3.mockserver

import platform.Foundation.NSMutableArray
import kotlin.native.concurrent.freeze

internal actual class QueueMockServerHandler : MockServerHandler {
  private val queue = NSMutableArray()

  actual fun enqueue(response: MockResponse) {
    queue.addObject(response.freeze())
  }

  actual override fun handle(request: MockRequest): MockResponse {
    check(queue.count.toInt() > 0) {
      "No more responses in queue"
    }
    val response = queue.objectAtIndex(0) as MockResponse
    queue.removeObjectAtIndex(0)
    return response
  }
}