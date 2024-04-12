# Learn Android Features

## FIGMA

## GraphQL

- Apollo: equivalent to Retrofit for GraphQL
- [Countries](https://studio.apollographql.com/public/countries/variant/current/home)

## iOS

## Mac

- defaults write com.apple.Finder AppleShowAllFiles true


FATAL EXCEPTION: main
Process: com.kryptopass.learn, PID: 28063
com.apollographql.apollo3.exception.ApolloHttpException: Http request failed with status code `400`
at com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.invokeSuspend(HttpNetworkTransport.kt:67)
at com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.invoke(Unknown Source:8)
at com.apollographql.apollo3.network.http.HttpNetworkTransport$execute$1.invoke(Unknown Source:4)
at kotlinx.coroutines.flow.SafeFlow.collectSafely(Builders.kt:61)
at kotlinx.coroutines.flow.AbstractFlow.collect(Flow.kt:230)
at kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl.flowCollect(ChannelFlow.kt:195)
at kotlinx.coroutines.flow.internal.ChannelFlowOperator.collectTo$suspendImpl(ChannelFlow.kt:157)
at kotlinx.coroutines.flow.internal.ChannelFlowOperator.collectTo(Unknown Source:0)
at kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1.invokeSuspend(ChannelFlow.kt:60)
at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
at kotlinx.coroutines.internal.LimitedDispatcher$Worker.run(LimitedDispatcher.kt:115)
at kotlinx.coroutines.scheduling.TaskImpl.run(Tasks.kt:100)
at kotlinx.coroutines.scheduling.CoroutineScheduler.runSafely(CoroutineScheduler.kt:584)
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.executeTask(CoroutineScheduler.kt:793)
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.runWorker(CoroutineScheduler.kt:697)
at kotlinx.coroutines.scheduling.CoroutineScheduler$Worker.run(CoroutineScheduler.kt:684)
Suppressed: kotlinx.coroutines.internal.DiagnosticCoroutineContextException: [StandaloneCoroutine{Cancelling}@8c8b368, Dispatchers.Main.immediate]
2024-04-12 14:22:18.510 28063-28063 Process                 com.kryptopass.learn                 I  Sending signal. PID: 28063 SIG: 9
2024-04-12 14:22:18.614  1443-1785  WindowManager           system_server                        E  win=Window{5134ebb u0 com.kryptopass.learn/com.kryptopass.learn.CountryActivity EXITING} destroySurfaces: appStopped=false cleanupOnResume=false win.mWindowRemovalAllowed=true win.mRemoveOnExit=true win.mViewVisibility=0 caller=com.android.server.wm.ActivityRecord.destroySurfaces:6539 com.android.server.wm.ActivityRecord.destroySurfaces:6520 com.android.server.wm.WindowState.onExitAnimationDone:5995 com.android.server.wm.ActivityRecord$$ExternalSyntheticLambda10.accept:2 java.util.ArrayList.forEach:1528 com.android.server.wm.ActivityRecord.onAnimationFinished:8607 com.android.server.wm.ActivityRecord.postApplyAnimation:6252 

