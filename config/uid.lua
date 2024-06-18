local main_function = function()
    CS.UnityEngine.Application.targetFrameRate = 360
    CS.UnityEngine.QualitySettings.vSyncCount = 0
    local hint = CS.UnityEngine.GameObject.Find("/UIRoot/AboveDialog/BetaHintDialog(Clone)/Contents/VersionText")
    hint.transform.localScale = CS.UnityEngine.Vector3(1.5, 1.5, 1.5)
    hint.transform.localPosition = CS.UnityEngine.Vector3(1, 20, 1)
    hint:GetComponent("Text").text = tostring("<color=#FF0000>Made by ZenithDEV CNPROD2.3.0</color>")--:gsub("\n", " ")
    local OldPing = CS.UnityEngine.GameObject.Find("/UIRoot/Page/MazeMainPage(Clone)/RightTopArea/NetStatusPanel/NetStatusPanel(Clone)/Connected/Time")
    local OldPing2 = CS.UnityEngine.GameObject.Find("/UIRoot/Page/BattleGamePhaseUI(Clone)/FunctionArea/NetStatusPanel/NetStatusPanel/Connected/Time")
    hint:SetActive(true)
    
    -- watermark - for posts
    local hint2 = CS.UnityEngine.GameObject.Find("/UIRoot/AboveDialog/BetaHintDialog(Clone)/Contents/HintText")
    local hint2text = hint2:GetComponent("Text")
    hint2.transform.localPosition = CS.UnityEngine.Vector3(700, 500, 320)
    hint2text.text = tostring("")
    hint2text.fontSize = 40.0 --#FF0000 #00FFFF
    hint2.transform.localPosition = CS.UnityEngine.Vector3(600, 400, 320)
    hint2text.horizontalOverflow = 1
    hint2text.verticalOverflow = 1
    hint2:SetActive(true)
  
    if OldPing then
      local NewPing = CS.UnityEngine.GameObject.Instantiate(OldPing, OldPing.transform.parent)
      NewPing.name = "Time(Clone)"
      NewPing:GetComponent("Text").text = tostring("<color=#2efff9>0ms</color>")
      OldPing:SetActive(false)
      --CS.UnityEngine.Object.Destroy(OldPing)
    end
    if OldPing2 then
      local NewPing2 = CS.UnityEngine.GameObject.Instantiate(OldPing2, OldPing2.transform.parent)
      NewPing2.name = "Time2(Clone)"
      OldPing2:SetActive(false)
      --CS.UnityEngine.Object.Destroy(OldPing2)
      NewPing2:GetComponent("Text").text = tostring("<color=#2efff9>0ms</color>")
    end
  end
  local on_error = function(error)
    CS.UnityEngine.Application.targetFrameRate = 360
    CS.UnityEngine.QualitySettings.vSyncCount = 0
    local files = io.open("./error.txt", "w")
    files:write(error)
    files:close()
  end
  xpcall(main_function, on_error)
  