from playsound import playsound
playsound('./beep.mp3')


import os
from pocketsphinx import LiveSpeech, get_model_path

model_path = get_model_path()

speech = LiveSpeech(
    verbose=False,
    sampling_rate=20000,
    buffer_size=2048,
    no_search=False,
    full_utt=False,
    hmm=os.path.join(model_path, 'en-us'),
    lm=os.path.join(model_path, 'en-us.lm.bin'),
    # dic = os.path.join(model_path, 'cmudict-en-us.dict')
    dic = ('./key.dict')
    # dic = ('./cmudict.dict')
)

for phrase in speech:
    print(phrase)
