#Region ; ***Directives created by AutoIt3Wrapper_GUI
#AutoIt3Wrapper_Res_requestedExecutionLevel=asInvoker
#EndRegion ; ***Directives created by


; Calling the function for uploading some image/doc in the Save As Window

fnHandleSaveAsPath($CmdLine[1], $CmdLine[2])

Func fnHandleSaveAsPath($strWinName1, $strFileName)
   
   WinWaitActive($strWinName1, "", 5)
   If WinExists($strWinName1) Then
      WinWaitActive($strWinName1, "", 5)
      Send($strFileName)
      Sleep(3)
      Send("{ENTER}")
      
   EndIf
   
EndFunc